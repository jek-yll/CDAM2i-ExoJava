package org.example.exercices.Library;

public class PaperBook extends Book{

    private Integer pages;
    private String publisher;
    public PaperBook(String title, String author, Integer pages, String publisher) {
        super(title, author);
        this.pages = pages;
        this.publisher = publisher;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "PaperBook" +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pages='" + pages + '\'' +
                ", statut='"+ statut + '\'' +
                '.';
    }
}
