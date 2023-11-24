package org.example.exercices.pooManagementBook;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    public List<Book> filterBooksByAuthorId(int authorId, List<Book> books) {
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getAuthors().stream().anyMatch(author -> author.getId() == authorId))
                .collect(Collectors.toList());

        return filteredBooks;
    }

    public List<Book> filterBooksByPublisherId(int publisherId, List<Book> books){
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getPublisher().getId() == publisherId)
                .collect(Collectors.toList());
        return filteredBooks;
    }

    public List<Book> filterBooksAfterSpecifiedYear(Integer yearFromInclusively, List<Book> books){
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getPublishingAnnee().equals(yearFromInclusively))
                .collect(Collectors.toList());
        return filteredBooks;
    }
}
