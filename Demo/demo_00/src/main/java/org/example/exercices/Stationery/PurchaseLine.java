package org.example.exercices.Stationery;

public class PurchaseLine {

    private Article article;

    private Integer quantity;

    public PurchaseLine(Article article, Integer quantity) {
        this.article = article;
        this.quantity = quantity;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(UnitArticle article) {
        this.article = article;
    }

    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getTotalLine(){

        Float totalPrice = 0F;
        return totalPrice = quantity * article.getUnitPrice();
    }

    public String DisplayPurchaseLine() {

        return quantity.toString() +
                " - " + article.getReference().toString()+
                " - " + article.getLabel() +
                " - " + article.getUnitPrice() +
                " - " + getTotalLine();
    }



    @Override
    public String toString() {
        return "PurchaseLine{" +
                "article=" + article +
                ", quantity=" + quantity +
                '}';
    }
}
