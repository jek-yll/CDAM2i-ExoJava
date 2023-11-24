package org.example.exercices.pooManagementBook;

import java.util.Arrays;
import java.util.List;

public class Book {

    private static Integer count = 0;

    private int id;
    private String name;
    private List<Author> authors;
    private Publisher publisher;
    private Integer publishingAnnee, amountOfPages;
    private Double price;
    private CoverType coverType;

    public Book( String name, List<Author> authors, Publisher publisher, Integer publishingAnnee, int amountOfPages, Double price, CoverType coverType) {
        this.id = count++;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingAnnee = publishingAnnee;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Integer getPublishingAnnee() {
        return publishingAnnee;
    }

    public void setPublishingAnnee(Integer publishingAnnee) {
        this.publishingAnnee = publishingAnnee;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", publisher=" + publisher +
                ", publishingAnnee=" + publishingAnnee +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                ", coverType=" + coverType +
                '}';
    }

}
