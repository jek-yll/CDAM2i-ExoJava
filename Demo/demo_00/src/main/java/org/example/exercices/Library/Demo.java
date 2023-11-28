package org.example.exercices.Library;

public class Demo {

    public static void main(String[] args) {

        Book book1 = new DigitalBook("Le tour du monde en 80 jours", "Jules Verne","PDF", 4000);
        Book book2 = new PaperBook("Spirou", "Rob-vel", 75, "Glenat");
        Person person = new Person("Jean", "Michel");
        Person person2 = new Person("Jean-Philippe", "Michel");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        System.out.println(library);
        System.out.println("Recherche de spirou :");
        System.out.println(library.findBookByTitle("Spirou"));

        System.out.println("Recherche des livres de Jules Vernes :");
        System.out.println(library.findBookByAuthor("Jules Verne"));

        System.out.println("Emprunt du livre id : 2 par la person person");
        System.out.println(book2);
        System.out.println(library.borrowABook(2,person));
        System.out.println(book2);

        System.out.println("Emprunt du livre id 2 par la person person2");
        System.out.println(book2);
        System.out.println(library.borrowABook(2,person2));
        System.out.println(book2);

        System.out.println("Retour du livre id 2 : par la person person");
        System.out.println(book2);
        System.out.println(library.returnBook(2));
        System.out.println(book2);

        System.out.println("Suppression du livre id 2 :");
        library.removeBook(2);
        System.out.println(library);

    }

}
