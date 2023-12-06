package org.example.exercices.Library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Loan> loans;

    public Library() {
        this.books = new ArrayList<Book>();
        this.loans = new ArrayList<Loan>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }

    public boolean addBook(Book book){
        return books.add(book);
    }

    public boolean removeBook(Integer idBook){
        for (Book b: books) {
            if (b.id.equals(idBook) ){
                books.remove(b);
                return true;
            }
        } return false;
    }

    public Book findBookById (Integer id){

        for (Book b: books) {
            if (b.id.equals(id)){
                return b;
            }
        }
        return null;
    }

    public ArrayList<Book> findBookByTitle (String title){

        ArrayList<Book> foundBooks = new ArrayList<Book>();

        for (Book b: books) {
            if (b.title.equals(title)){
                foundBooks.add(b);
            }
        }
        return foundBooks;
    }

    public ArrayList<Book> findBookByAuthor (String author){

        ArrayList<Book> foundBooks = new ArrayList<Book>();

        for (Book b: books) {
            if (b.author.equals(author)){
                foundBooks.add(b);
            }
        }
        return foundBooks;
    }

    public boolean borrowABook (Integer idBook, Person person){

        Book bookToBorrow = findBookById(idBook);

        if (loans.isEmpty()){
            Loan newLoan = new Loan(bookToBorrow, person, LocalDate.now(), LocalDate.now().plusWeeks(2));
            loans.add(newLoan);
            bookToBorrow.setStatut(LoanStatut.BORROWED);
            return true;
        } else {
            for ( Loan l : loans) {
                if (!l.getBook().id.equals(idBook) || (l.getBook().id.equals(idBook) && l.getEndDate().isBefore(LocalDate.now()))){
                    Loan newLoan = new Loan(bookToBorrow, person, LocalDate.now(), LocalDate.now().plusWeeks(2));
                    loans.add(newLoan);
                    bookToBorrow.setStatut(LoanStatut.BORROWED);
                    return true;
                }
            }
        }
        return false;
    }

    //todo gérer la date de retour
    public boolean returnBook (Integer idBook){
        Book bookToReturn = findBookById(idBook);
        bookToReturn.setStatut(LoanStatut.FREE);
        return true;
    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", loans=" + loans +
                '}';
    }
}
