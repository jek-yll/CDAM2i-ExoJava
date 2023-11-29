package org.example.exercices.Stationery;

import java.util.HashMap;

public class Article {

    private static Integer count = 0;
    private String reference;

    private static HashMap <String, Article> bdd = new HashMap<>();

    public Article(String reference) {
        this.reference = reference;
        addArticleToBdd(this);
    }

    public String getReference() {
        return reference;
    }

    public static void addArticleToBdd(Article article){
        bdd.put(article.reference, article);
    }

    public static Article getArticleToBdd(String ref){
        return bdd.get(ref);
    }

    @Override
    public String toString() {
        return "Article{" +
                "reference=" + reference +
                '}';
    }

    public Float getUnitPrice() {
        return 0F;
    }

    public String getLabel() {
        return "";
    }
}
