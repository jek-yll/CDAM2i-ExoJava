package org.example.exercices.Library;

public abstract class Book {

    private static Integer count = 0;
    protected Integer id;
    protected String title, author;
    protected LoanStatut statut;

    public Book(String title, String author) {
        this.id = ++count;
        this.title = title;
        this.author = author;
        this.statut = LoanStatut.FREE;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LoanStatut getStatut() {
        return statut;
    }

    public void setStatut(LoanStatut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Book " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", statut='"+ statut + '\'' +
                '.';
    }
}
