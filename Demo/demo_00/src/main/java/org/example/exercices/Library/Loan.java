package org.example.exercices.Library;

import java.time.LocalDate;

public class Loan {

    private Book book;
    private Person person;
    private LocalDate startDate;
    private LocalDate endDate;

    public Loan(Book book, Person person, LocalDate startDate, LocalDate endDate) {
        this.book = book;
        this.person = person;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Loan" +
                "book=" + book +
                ", person=" + person +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '.';
    }
}
