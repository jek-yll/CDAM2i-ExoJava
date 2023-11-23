package org.example.exercices.pooManagementBook;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    public List<Book> filterBooksByAuthor(Author author, List<Book> books){

        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getAuthors().equals(author))
                .collect(Collectors.toList());

        return books;
    }

    public List<Book> filterBooksByPublisher(Publisher publisher, List<Book> books){
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getPublisher().equals(publisher))
                .collect(Collectors.toList());
        return books;
    }

    public List<Book> filterBooksAfterSpecifiedYear(Integer yearFromInclusively, List<Book> books){
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getPublishingAnnee().equals(yearFromInclusively))
                .collect(Collectors.toList());
        return books;
    }
}
