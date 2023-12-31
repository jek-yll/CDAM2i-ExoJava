package org.example.exercices.pooManagementBook;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Book_1", List.of(new Author(1, "Jon", "Johnsons")),
                new Publisher(1, "Publisher_1"), 1990, 231, 24.99, CoverType.BROCHE));

        books.add(new Book("Book_2", List.of(new Author(1, "Jon", "Johnsons"), new Author(2, "William", "Wilson")),
                new Publisher(2, "Publisher_2"), 2000, 120, 14.99, CoverType.BROCHE));

        books.add(new Book("Book_3", List.of(new Author(3, "Walter", "Peterson")),
                new Publisher(1, "Publisher_1"), 1997, 350, 34.99, CoverType.RELIE));

        books.add(new Book("Book_4", List.of(new Author(4, "Craig", "Gregory")),
                new Publisher(3, "Publisher_3"), 1992, 185, 19.99, CoverType.RELIE));


        System.out.println(books);

        BookService bookService = new BookService();

        System.out.println(bookService.filterBooksByAuthorId(1, books));

        System.out.println(bookService.filterBooksByPublisherId(3, books));

        System.out.println(bookService.filterBooksAfterSpecifiedYear(1997, books));


    }
}
